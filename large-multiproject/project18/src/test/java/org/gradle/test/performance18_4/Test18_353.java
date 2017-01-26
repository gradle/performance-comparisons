package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_353 {
    private final Production18_353 production = new Production18_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}