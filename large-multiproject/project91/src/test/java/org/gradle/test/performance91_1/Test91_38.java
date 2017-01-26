package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_38 {
    private final Production91_38 production = new Production91_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}