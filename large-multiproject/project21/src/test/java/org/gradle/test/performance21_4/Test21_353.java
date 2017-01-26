package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_353 {
    private final Production21_353 production = new Production21_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}