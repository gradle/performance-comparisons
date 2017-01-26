package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_293 {
    private final Production64_293 production = new Production64_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}