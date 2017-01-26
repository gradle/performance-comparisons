package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_353 {
    private final Production42_353 production = new Production42_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}