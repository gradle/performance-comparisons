package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_347 {
    private final Production64_347 production = new Production64_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}