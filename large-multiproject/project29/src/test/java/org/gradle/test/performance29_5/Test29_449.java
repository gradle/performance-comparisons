package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_449 {
    private final Production29_449 production = new Production29_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}