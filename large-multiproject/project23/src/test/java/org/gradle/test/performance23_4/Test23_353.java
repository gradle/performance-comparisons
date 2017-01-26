package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_353 {
    private final Production23_353 production = new Production23_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}