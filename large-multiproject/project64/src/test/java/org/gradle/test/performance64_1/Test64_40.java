package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_40 {
    private final Production64_40 production = new Production64_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}