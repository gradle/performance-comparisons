package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_449 {
    private final Production37_449 production = new Production37_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}