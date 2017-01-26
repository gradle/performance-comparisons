package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_126 {
    private final Production91_126 production = new Production91_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}