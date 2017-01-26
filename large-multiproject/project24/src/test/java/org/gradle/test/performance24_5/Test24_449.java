package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_449 {
    private final Production24_449 production = new Production24_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}