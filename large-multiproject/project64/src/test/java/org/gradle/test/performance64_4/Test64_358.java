package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_358 {
    private final Production64_358 production = new Production64_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}