package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_353 {
    private final Production86_353 production = new Production86_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}