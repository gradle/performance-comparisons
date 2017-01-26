package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_225 {
    private final Production64_225 production = new Production64_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}