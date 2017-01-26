package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_449 {
    private final Production65_449 production = new Production65_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}