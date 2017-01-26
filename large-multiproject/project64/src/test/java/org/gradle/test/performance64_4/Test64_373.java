package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_373 {
    private final Production64_373 production = new Production64_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}