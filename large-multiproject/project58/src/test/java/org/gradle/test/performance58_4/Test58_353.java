package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_353 {
    private final Production58_353 production = new Production58_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}