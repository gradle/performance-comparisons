package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_353 {
    private final Production49_353 production = new Production49_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}