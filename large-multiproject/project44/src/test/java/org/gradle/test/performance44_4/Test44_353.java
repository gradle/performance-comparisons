package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_353 {
    private final Production44_353 production = new Production44_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}