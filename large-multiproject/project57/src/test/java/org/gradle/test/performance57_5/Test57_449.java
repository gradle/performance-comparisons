package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_449 {
    private final Production57_449 production = new Production57_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}