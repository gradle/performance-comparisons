package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_126 {
    private final Production73_126 production = new Production73_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}