package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_353 {
    private final Production31_353 production = new Production31_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}