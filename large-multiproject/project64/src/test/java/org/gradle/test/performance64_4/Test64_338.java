package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_338 {
    private final Production64_338 production = new Production64_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}