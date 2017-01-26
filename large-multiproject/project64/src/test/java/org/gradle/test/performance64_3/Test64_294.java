package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_294 {
    private final Production64_294 production = new Production64_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}