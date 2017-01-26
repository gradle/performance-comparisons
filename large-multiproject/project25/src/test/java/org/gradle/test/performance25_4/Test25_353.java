package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_353 {
    private final Production25_353 production = new Production25_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}