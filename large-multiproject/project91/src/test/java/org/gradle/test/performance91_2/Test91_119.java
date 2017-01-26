package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_119 {
    private final Production91_119 production = new Production91_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}