package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_449 {
    private final Production68_449 production = new Production68_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}