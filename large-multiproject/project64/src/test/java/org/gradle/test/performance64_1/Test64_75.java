package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_75 {
    private final Production64_75 production = new Production64_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}