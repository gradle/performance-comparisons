package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_449 {
    private final Production19_449 production = new Production19_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}