package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_85 {
    private final Production42_85 production = new Production42_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}