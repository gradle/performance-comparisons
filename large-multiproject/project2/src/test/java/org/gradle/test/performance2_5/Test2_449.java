package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_449 {
    private final Production2_449 production = new Production2_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}