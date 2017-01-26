package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_353 {
    private final Production81_353 production = new Production81_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}