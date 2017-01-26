package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_96 {
    private final Production91_96 production = new Production91_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}