package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_449 {
    private final Production20_449 production = new Production20_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}