package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_353 {
    private final Production77_353 production = new Production77_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}