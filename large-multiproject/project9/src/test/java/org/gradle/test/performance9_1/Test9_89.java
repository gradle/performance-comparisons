package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_89 {
    private final Production9_89 production = new Production9_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}