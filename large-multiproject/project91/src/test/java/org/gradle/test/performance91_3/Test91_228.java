package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_228 {
    private final Production91_228 production = new Production91_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}