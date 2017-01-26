package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_98 {
    private final Production64_98 production = new Production64_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}