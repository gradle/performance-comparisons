package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_89 {
    private final Production11_89 production = new Production11_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}