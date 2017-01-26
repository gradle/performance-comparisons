package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_353 {
    private final Production92_353 production = new Production92_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}