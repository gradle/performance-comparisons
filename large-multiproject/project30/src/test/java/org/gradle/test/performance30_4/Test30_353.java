package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_353 {
    private final Production30_353 production = new Production30_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}