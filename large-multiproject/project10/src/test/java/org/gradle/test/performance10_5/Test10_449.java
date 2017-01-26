package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_449 {
    private final Production10_449 production = new Production10_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}