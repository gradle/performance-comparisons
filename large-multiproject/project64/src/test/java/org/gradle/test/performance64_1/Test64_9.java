package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_9 {
    private final Production64_9 production = new Production64_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}