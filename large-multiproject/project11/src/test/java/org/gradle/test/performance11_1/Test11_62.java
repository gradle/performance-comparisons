package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_62 {
    private final Production11_62 production = new Production11_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}