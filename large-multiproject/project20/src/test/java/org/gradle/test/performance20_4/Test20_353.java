package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_353 {
    private final Production20_353 production = new Production20_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}