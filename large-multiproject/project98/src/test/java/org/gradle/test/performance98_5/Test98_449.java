package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_449 {
    private final Production98_449 production = new Production98_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}