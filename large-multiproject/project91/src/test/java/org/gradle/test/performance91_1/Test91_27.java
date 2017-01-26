package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_27 {
    private final Production91_27 production = new Production91_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}