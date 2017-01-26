package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_8 {
    private final Production11_8 production = new Production11_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}