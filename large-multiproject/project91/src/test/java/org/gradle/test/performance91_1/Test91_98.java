package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_98 {
    private final Production91_98 production = new Production91_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}