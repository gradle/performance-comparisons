package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_281 {
    private final Production11_281 production = new Production11_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}