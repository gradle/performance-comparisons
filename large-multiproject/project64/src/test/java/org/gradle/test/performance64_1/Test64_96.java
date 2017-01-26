package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_96 {
    private final Production64_96 production = new Production64_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}