package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_353 {
    private final Production39_353 production = new Production39_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}