package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_449 {
    private final Production17_449 production = new Production17_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}