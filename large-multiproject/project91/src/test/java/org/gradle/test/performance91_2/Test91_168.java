package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_168 {
    private final Production91_168 production = new Production91_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}