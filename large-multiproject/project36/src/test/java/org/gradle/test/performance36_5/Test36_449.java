package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_449 {
    private final Production36_449 production = new Production36_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}