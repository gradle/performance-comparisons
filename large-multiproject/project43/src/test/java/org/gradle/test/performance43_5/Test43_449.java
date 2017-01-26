package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_449 {
    private final Production43_449 production = new Production43_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}