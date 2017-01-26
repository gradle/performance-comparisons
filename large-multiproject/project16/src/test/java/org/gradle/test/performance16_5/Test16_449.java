package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_449 {
    private final Production16_449 production = new Production16_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}